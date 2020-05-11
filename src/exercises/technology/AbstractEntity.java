package exercises.technology;

import java.util.Objects;

public abstract class AbstractEntity {
    private int id;
    private static int nextId = 1;

    AbstractEntity() {
        id = nextId;
        nextId++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }
}
