package showtime;

public class CastMember extends Person {
    private int numRoles;
    private Role[] roles;

    public CastMember(String name, int age, int numRoles) {
        super(name, age);
        this.numRoles = numRoles;
        this.roles = new Role[numRoles];
    }

    public int getNumRoles() {
        return numRoles;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void addRole(Role role) {
        for (int i = 0; i < roles.length; i++) {
            if (roles[i] == null) {
                roles[i] = role;
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString() + " as:\n");
        for (Role role : roles) {
            if (role != null) {
                sb.append("- ").append(role).append("\n");
            }
        }
        return sb.toString();
    }
}