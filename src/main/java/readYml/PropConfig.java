package readYml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "abc")
public class PropConfig {

	private String xyz;
	private String mnq;
	private Aaa aaa;

	public String getXyz() {
		return xyz;
	}

	public void setXyz(String xyz) {
		this.xyz = xyz;
	}

	public String getMnq() {
		return mnq;
	}

	public void setMnq(String mnq) {
		this.mnq = mnq;
	}
	
	public Aaa getAaa() {
		return aaa;
	}

	public void setAaa(Aaa aaa) {
		this.aaa = aaa;
	}


	private static class Aaa {
		private String bbb;
		private String ccc;

		public String getBbb() {
			return bbb;
		}

		public void setBbb(String bbb) {
			this.bbb = bbb;
		}

		public String getCcc() {
			return ccc;
		}

		public void setCcc(String ccc) {
			this.ccc = ccc;
		}

		@Override
		public String toString() {
			return "Aaa [bbb=" + bbb + ", ccc=" + ccc + "]";
		}

	}

	@Override
	public String toString() {
		return "PropConfig [xyz=" + xyz + ", mnq=" + mnq + ", aaa=" + aaa + "]";
	}

}
