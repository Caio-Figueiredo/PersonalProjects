package com.tempo.project.entities;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "team")
public class Team implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    private UUID teamId;
    @Column
    private String teamName, teamLeadId;
    @Column()
    @OneToMany(targetEntity = TempoUsers.class)
    private List<String> teamMembersId = new ArrayList<>();

    public Team(){}

    public Team(UUID teamId, String teamName, String teamLeadId, List<String> teamMembersId) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamLeadId = teamLeadId;
        this.teamMembersId = teamMembersId;
    }

    public UUID getTeamId() {
        return teamId;
    }

    public void setTeamId(UUID teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamLeadId() {
        return teamLeadId;
    }

    public void setTeamLeadId(String teamLeadId) {
        this.teamLeadId = teamLeadId;
    }

    public List<String> getTeamMembersId() {
        return teamMembersId;
    }
}
