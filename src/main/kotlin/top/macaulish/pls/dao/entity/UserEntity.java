package top.macaulish.pls.dao.entity;

import java.util.Objects;

public class UserEntity {
    private int id;
    private String guid;
    private String username;
    private String password;
    private Integer privilege;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Integer privilege) {
        this.privilege = privilege;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(privilege, that.privilege);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, guid, username, password, privilege);
    }
}
