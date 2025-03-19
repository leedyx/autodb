package org.hc.dao;

import org.hc.model.AllFloatTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FloatDao extends JpaRepository<AllFloatTypes,Long> {
}
