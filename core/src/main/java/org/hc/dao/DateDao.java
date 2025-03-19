package org.hc.dao;

import org.hc.model.AllDateTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateDao extends JpaRepository<AllDateTypes,Long> {
}
