package telran.blocker.dto;

import java.util.Objects;

public record IpData(String IP, String webService , long timestamp) {
	
	@Override
	public int hashCode() {
		return Objects.hash(IP, webService);
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
		return Objects.equals(IP, other.IP) && Objects.equals(webService,  other.webService);
	}

}