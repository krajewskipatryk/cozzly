package database

class CustomRepositoryImpl<T : Entity> : CustomRepository<T> {
    private val inMemoryDB = mutableMapOf<String, T>()

    override fun persist(t: T): T {
        inMemoryDB[t.getId()] = t
        return t;
    }

    override fun get(id: String): T? {
        return inMemoryDB[id];
    }
}