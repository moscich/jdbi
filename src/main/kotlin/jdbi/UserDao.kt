package jdbi
import org.jdbi.v3.sqlobject.statement.SqlQuery
import org.jdbi.v3.sqlobject.statement.SqlUpdate

interface UserDao {
    @SqlUpdate("INSERT INTO users(name, last_name) VALUES (:user.name, :user.lastName)")
    fun insertUser(user: User)

    @SqlQuery("SELECT name, last_name FROM users")
    fun getUsers(): List<User>
}

data class User(val name: String, val lastName: String)