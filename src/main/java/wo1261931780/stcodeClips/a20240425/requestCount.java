package wo1261931780.stcodeClips.a20240425;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20240425
 *
 * @author liujiajun_junw
 * @Date 2024-04-20-39  星期一
 * @Description
 */

/**
 * 授权token请求限制缓存
 */
@Component
public class requestCount {
	// 请求次数检查代码实现：
	@Autowired
	private RedisTemplate<String, Integer> redisTemplate;

	private static final String AUTH_TOKEN_LIMIT_KEY_PREFIX = "auth_token_limit";

	/**
	 * 请求次数+1并检查是否超限
	 *
	 * @param token
	 * @return 是否放行
	 */
	public boolean incrementWithCheck(String token) {
		// 1.获取token请求次数限制，获取为null代表授权配置已被修改，此token已经不具备权限
		Integer limit = getLimit(token);
		if (limit == null) {
			return false;
		}
		// 2.组装缓存key，读取缓存
		String key = String.join(":", AUTH_TOKEN_LIMIT_KEY_PREFIX, token);
		Integer count = redisTemplate.opsForValue().get(key);
		// 3.没有值代表一分钟内没有请求产生了
		if (count == null) {
			// 初始化值
			redisTemplate.opsForValue().increment(key);
			// 设置过期时间
			redisTemplate.expire(key, 1L, TimeUnit.MINUTES);
			return true;
		}
		// 自增并获取当前值 大于限制的话 返回false 网关过滤器返回提示信息（如请求过于频繁）
		Long inc = redisTemplate.opsForValue().increment(key);
		return inc <= limit;
	}

	/**
	 * 获取限值
	 *
	 * @param token
	 * @return
	 */
	public Integer getLimit(String token) {
		Object limit = redisTemplate.opsForHash().get("auth_token_limit", token);
		return limit == null ? null : (Integer) limit;
	}
}
}
