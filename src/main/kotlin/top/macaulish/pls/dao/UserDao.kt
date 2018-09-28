package top.macaulish.pls.dao

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.orm.hibernate5.HibernateTemplate
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import top.macaulish.pls.dao.entity.UserEntity

@Component
class UserDao :_userDao {

    @Autowired
    private lateinit var db: HibernateTemplate

    @Transactional(readOnly = false)
    override fun save(user: UserEntity): Boolean {
        return try {
            db.save(user)
            true
        }catch (e:Exception){
            e.printStackTrace()
            false
        }
    }

    @Transactional(readOnly = false)
    override fun saveOrUpdate(user: UserEntity): Boolean {
        return try {
            db.saveOrUpdate(user)
            true
        }catch (e:Exception){
            e.printStackTrace()
            false
        }
    }

    @Transactional(readOnly = false)
    override fun delete(user: UserEntity): Boolean {
        return try {
            db.delete(user)
            true
        }catch (e:Exception){
            e.printStackTrace()
            false
        }
    }

    @Transactional(readOnly = false)
    override fun deleteByExample(user: UserEntity): Boolean {
        return try{
            val tasks = db.findByExample(user)
            for(t in tasks){
                db.delete(t)
            }
            true
        }catch (e:Exception){
            e.printStackTrace()
            false
        }
    }

    @Transactional(readOnly = false)
    override fun update(user: UserEntity): Boolean {
        return try{
            db.update(user)
            true
        }catch (e:Exception){
            e.printStackTrace()
            false
        }
    }

    @Transactional(readOnly = true)
    override fun queryFirstByExample(user: UserEntity): UserEntity? {
        val tasks = db.findByExample(user)
        return if(tasks.isEmpty()) null else tasks[0]
    }

    @Transactional(readOnly = true)
    override fun queryByExample(user: UserEntity): List<UserEntity> {
        return db.findByExample(user)
    }
}