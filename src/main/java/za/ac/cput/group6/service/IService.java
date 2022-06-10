package za.ac.cput.group6.service;

public interface IService<T, ID> {

    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}