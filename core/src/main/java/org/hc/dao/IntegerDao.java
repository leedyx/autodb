package org.hc.dao;

import org.hc.model.AllIntegerTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntegerDao extends JpaRepository<AllIntegerTypes,Long> {
}
