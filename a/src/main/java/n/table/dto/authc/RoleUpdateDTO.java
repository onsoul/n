package n.table.dto.authc;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import n.core.dto.TransientDTO;

public class RoleUpdateDTO extends TransientDTO<Integer> {

	private static final long serialVersionUID = 906353191615425927L;
	
	@NotNull
	private Integer id;
	
	@NotNull
	private Integer roleType;
	
	@Length(min=3,max=15)
	private String roleName;
	
	private Integer parentId;

	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

}
