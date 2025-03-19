package org.hc.dao;

import org.hc.model.AllStringTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StringDao extends JpaRepository<AllStringTypes,Long> {
}
