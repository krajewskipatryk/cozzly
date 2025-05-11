package database

interface CustomRepository<T : Entity> {
    fun persist(t : T) : T
    fun get(id : String) : T?
}