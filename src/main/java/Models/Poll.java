package Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Poll implements Models {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pollId;
    private String pollName;
    private boolean status;
    private String Winner;

    public int getPollId() {
        return pollId;
    }

    public void setPollId(int pollId) {
        this.pollId = pollId;
    }

    public String getPollName() {
        return pollName;
    }

    public void setPollName(String pollName) {
        this.pollName = pollName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getWinner() {
        return Winner;
    }

    public void setWinner(String winner) {
        Winner = winner;
    }

}
