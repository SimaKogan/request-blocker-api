package telran.blocker.dto;

import java.util.Objects;

public record IpData(String IP, String webService, long timestamp) {
	
	@Override
	public int hashCode() {
		return Object.hash(IP, webService);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IpData other = (IpData) obj;
		return Object.equals(IP, other.IP) && Object.equals(webService, other.webService);
	}
	
}