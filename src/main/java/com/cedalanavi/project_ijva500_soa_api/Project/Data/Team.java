package com.cedalanavi.project_ijva500_soa_api.Project.Data;

import java.util.List;

import javax.persistence.ElementCollection;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Team {
	@JsonIgnore(value = false)
	public String name;

	@JsonIgnore(value = false)
	public TypeTeam typeTeam;
	
	@ElementCollection
	public List<String> usersIds;
}
