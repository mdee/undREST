package service;

import dao.BaseDao;

/**
 * Basic interface for services
 * @author MDee
 *
 */
public interface BaseService {

    public void setDao(BaseDao albombDao);
    
    public BaseDao getDao();
}
