package wo1261931780.stcodeClips.a20240514;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20240514
 *
 * @author liujiajun_junw
 * @Date 2024-05-21-29  星期二
 * @Description 简化的Snowflake算法实现
 */
public class SnowflakeIdGenerator {
	/**
	 * Snowflake ID结构
	 * Snowflake生成的64位ID可以分为以下几个部分：
	 *
	 * 1、 1位符号位：由于整数的最高位是符号位，且64位整数中的最高位为符号位，通常这一位为0，保证ID为正数；
	 * 2、 41位时间戳位：记录时间戳的差值（相对于某个固定的时间点），单位到毫秒41位时间戳可以使用69年；
	 * 3、 10位数据中心ID和机器ID：通常分为5位数据中心ID和5位机器ID，最多支持32个数据中心，每个数据中心最多支持32台机器；
	 * 4、 12位序列号：用来记录同一毫秒内生成的不同ID，12位序列号支持每个节点每毫秒产生4096个ID序号；
	 */
	private long datacenterId; // 数据中心ID
	private long machineId;    // 机器ID
	private long sequence = 0L; // 序列号
	private long lastTimestamp = -1L; // 上一次时间戳

	private final long twepoch = 1288834974657L;
	private final long datacenterIdBits = 5L;
	private final long machineIdBits = 5L;
	private final long maxDatacenterId = -1L ^ (-1L << datacenterIdBits);
	private final long maxMachineId = -1L ^ (-1L << machineIdBits);
	private final long sequenceBits = 12L;

	private final long machineIdShift = sequenceBits;
	private final long datacenterIdShift = sequenceBits + machineIdBits;
	private final long timestampLeftShift = sequenceBits + machineIdBits + datacenterIdBits;
	private final long sequenceMask = -1L ^ (-1L << sequenceBits);

	public SnowflakeIdGenerator(long datacenterId, long machineId) {
		if (datacenterId > maxDatacenterId || datacenterId < 0) {
			throw new IllegalArgumentException("datacenterId can't be greater than %d or less than 0");
		}
		if (machineId > maxMachineId || machineId < 0) {
			throw new IllegalArgumentException("machineId can't be greater than %d or less than 0");
		}
		this.datacenterId = datacenterId;
		this.machineId = machineId;
	}

	public synchronized long nextId() {
		long timestamp = System.currentTimeMillis();

		if (timestamp < lastTimestamp) {
			throw new RuntimeException("Clock moved backwards. Refusing to generate id");
		}

		if (lastTimestamp == timestamp) {
			sequence = (sequence + 1) & sequenceMask;
			if (sequence == 0) {
				timestamp = tilNextMillis(lastTimestamp);
			}
		} else {
			sequence = 0L;
		}

		lastTimestamp = timestamp;

		return ((timestamp - twepoch) << timestampLeftShift) |
				(datacenterId << datacenterIdShift) |
				(machineId << machineIdShift) |
				sequence;
	}

	private long tilNextMillis(long lastTimestamp) {
		long timestamp = System.currentTimeMillis();
		while (timestamp <= lastTimestamp) {
			timestamp = System.currentTimeMillis();
		}
		return timestamp;
	}
	/**
	 * 类定义和变量初始化
	 * private long datacenterId; 定义数据中心ID。
	 * private long machineId; 定义机器ID。
	 * private long sequence = 0L; 序列号，用于同一毫秒内生成多个ID时区分这些ID。
	 * private long lastTimestamp = -1L; 上一次生成ID的时间戳。
	 * 以下是Snowflake算法的一些关键参数：
	 *
	 * private final long twepoch = 1288834974657L; 系统的起始时间戳，这里是Snowflake算法的作者选择的一个固定的时间点（2010-11-04 09:42:54.657 GMT）。
	 * private final long datacenterIdBits = 5L; 数据中心ID所占的位数。
	 * private final long machineIdBits = 5L; 机器ID所占的位数。
	 * private final long maxDatacenterId = -1L ^ (-1L `<< datacenterIdBits); 数据中心ID的最大值，这里通过位运算计算得出。
	 * private final long maxMachineId = -1L ^ (-1L `<< machineIdBits); 机器ID的最大值，同样通过位运算得出。
	 * private final long sequenceBits = 12L; 序列号占用的位数。
	 * 以下是一些用于位运算的参数，用于计算最终的ID：
	 *
	 * private final long machineIdShift = sequenceBits; 机器ID的偏移位数。
	 * private final long datacenterIdShift = sequenceBits + machineIdBits; 数据中心ID的偏移位数。
	 * private final long timestampLeftShift = sequenceBits + machineIdBits + datacenterIdBits; 时间戳的偏移位数。
	 * private final long sequenceMask = -1L ^ (-1L `<< sequenceBits); 用于保证序列号在指定范围内循环。
	 * 构造函数
	 * 构造函数SnowflakeIdGenerator(long datacenterId, long machineId)接收数据中心ID和机器ID作为参数，并对这些参数进行校验，确保它们在合法范围内。
	 * ID生成方法
	 * public synchronized long nextId()是生成ID的核心方法，使用synchronized保证线程安全。
	 *
	 * 首先获取当前时间戳。
	 *
	 * 如果当前时间戳小于上一次生成ID的时间戳，抛出异常，因为时钟回拨会导致ID重复。
	 *
	 * 如果当前时间戳等于上一次的时间戳（即同一毫秒内），通过增加序列号生成不同的ID；如果序列号溢出（超过最大值），则等待到下一个毫秒。
	 *
	 * 如果当前时间戳大于上一次的时间戳，重置序列号为0。
	 *
	 * 最后，将时间戳、数据中心ID、机器ID和序列号按照各自的偏移量左移，然后进行位或运算，组合成一个64位的ID。
	 *
	 * 辅助方法
	 * private long tilNextMillis(long lastTimestamp)是一个辅助方法，用于在序列号溢出时等待直到下一个毫秒。
	 */
}
