package readYml;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "states")
public class State implements Serializable {

	private static final long serialVersionUID = 2785444869677120157L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "state")
	private String state;
	

	public State() {
	}

	public State(long id, String state) {
		this.id = id;
		this.state = state;
	}

	public State(String state) {
		this.state = state;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
