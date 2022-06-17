package za.ac.cput.group6.service;
import java.util.Optional;
public interface IService<T, ID> {

    T create(T t);
  Optional < T> read(ID id);
    T update(T t);
    void delete(ID id);
}