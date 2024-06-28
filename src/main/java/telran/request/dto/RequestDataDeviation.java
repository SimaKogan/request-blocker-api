package telran.request.dto;

import java.util.Objects;

public record RequestDataDeviation(long sensorId, float value, float deviation, long timestamp) {

	@Override
	public int hashCode() {
		return Objects.hash(deviation, sensorId, value);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestDataDeviation other = (RequestDataDeviation) obj;
		return Float.floatToIntBits(deviation) == Float.floatToIntBits(other.deviation)
				&& Float.floatToIntBits(value) == Float.floatToIntBits(other.value);
	}
 }
