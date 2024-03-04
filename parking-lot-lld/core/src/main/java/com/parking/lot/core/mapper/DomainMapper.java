package com.parking.lot.core.mapper;

public interface DomainMapper<D, E> {

    E convertToEntity(D domain);
    D convertToDomain(E entity);

}
