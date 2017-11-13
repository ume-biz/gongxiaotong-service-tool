package cn.com.gxt.entity.crud;

import java.util.List;
import java.util.Map;
import cn.com.gxt.entity.OrderDto;

/*
 * 需求信息主表:ORDER CRUD service interface declare.<br>
 *
 * @author UME-Generator
 */
public interface OrderCrudService {
    /**
     * Enable/Disable operation history table automatic insert.<br>
     * 
     * @param enable the enable to set
     */
    void setEnableOperationHistory(boolean enable);

    /**
     * Insert entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer create(OrderDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<OrderDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(OrderDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<OrderDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(OrderDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<OrderDto> entityList);
    
    /**
     * Update entity (full filed update include null value).<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer updateFully(OrderDto entity);
    
    /**
     * Update entity list (full filed update include null value).<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateFullyList(List<OrderDto> entityList);

    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(OrderDto entity);
    
    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<OrderDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance
     */
    OrderDto find(OrderDto condition);
    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param condition - query parameter describe by entity
     * @return - matched entity instance list
     */
    List<OrderDto> findList(OrderDto condition);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param condition - query parameter describe by map
     * @return - matched entity instance list
     */
    List<OrderDto> findListLike(Map<String, String> condition);
    
    /**
     * Search entity list use dynamic condition.<br>
     * 
     * @param dynaCondition - dynamic query parameter describe by map
     * @return - matched entity instance list
     */
    List<OrderDto> findListMatch(Map<String, String> dynaCondition);
    
    /**
     * Count.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    Integer count(Map<String, String> condition);

}
