package com.activequant.dao.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;

import com.activequant.dao.mybatis.mapper.GenericRowMapper;
import com.activequant.domainmodel.Position;
import com.activequant.interfaces.dao.IPositionDao;

public class PositionDao extends GenericMapperDao<Position> implements IPositionDao {

    // private Logger log = Logger.getLogger(InstrumentDao.class);
    private static final String tableName = "Position";

    public PositionDao(GenericRowMapper mapper, SqlSessionFactory s) {
        super(s, mapper, Position.class, tableName);
    }

}
