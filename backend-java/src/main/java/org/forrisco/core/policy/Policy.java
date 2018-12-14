package org.forrisco.core.policy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.forpdi.core.company.Company;

import br.com.caelum.vraptor.boilerplate.SimpleLogicalDeletableEntity;
import br.com.caelum.vraptor.serialization.SkipSerialization;

/**
 * @author Matheus Nascimento
 * 
 */
@Entity(name = Policy.TABLE)
@Table(name = Policy.TABLE)

public class Policy extends SimpleLogicalDeletableEntity {
	public static final String TABLE = "frisco_policy";
	private static final long serialVersionUID = 1L;

	@Column(nullable=false, length=255)
	private String name;

	@Column(nullable=true, length=4000)
	private String description;
	
	@Column(nullable=false)
	private int nline;
	
	@Column(nullable=false)
	private int ncolumn;

	@Column(nullable=false, length=4000)
	private String probability;

	@Column(nullable=false, length=4000)
	private String impact;
	
	@Column(nullable=false, length=4000)
	private String matrix;

	@Transient
	private String risk_level[][];

	@SkipSerialization
	@ManyToOne(targetEntity=Company.class, optional=false, fetch=FetchType.EAGER)
	private Company company;

	private boolean archived = false;
	
	public boolean isArchived() {
		return archived;
	}

	public void setArchived(boolean archived) {
		this.archived = archived;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNline() {
		return nline;
	}

	public void setNline(int nline) {
		this.nline = nline;
	}

	public int getNcolumn() {
		return ncolumn;
	}

	public void setNcolumn(int ncolumn) {
		this.ncolumn = ncolumn;
	}

	public String getProbability() {
		return probability;
	}

	public void setProbability(String probability) {
		this.probability = probability;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	public String getMatrix() {
		return matrix;
	}

	public void setMatrix(String matrix) {
		this.matrix = matrix;
	}

	public String[][] getRisk_leve() {
		return risk_level;
	}

	public void setRisk_leve(String[][] risk_level) {
		this.risk_level = risk_level;
	}

}