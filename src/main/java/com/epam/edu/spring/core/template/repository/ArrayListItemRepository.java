package com.epam.edu.spring.core.template.repository;

import com.epam.edu.spring.core.template.entity.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Репозиторий, основанный на классе ArrayList.
 * initialSequence должен браться из application.properties
 */
public class ArrayListItemRepository extends AbstractRepository<Item> implements ItemRepository {

    List<Item> holder = new ArrayList<>();
    String initialSequenceFromProperties;
    @Override
    public Item getById(long id) {
        for (Item element: holder) {
            if (element.getId() == id) {
                return element;
            }
        }
        return null;
    }

    @Override
    public boolean createItem(Item item) {

        setInitialSequence(Integer.valueOf(initialSequenceFromProperties));
        item.setId(initialSequence);
        if (getById(item.getId())==null){
            holder.add(item);
            setHolder();
            return true;
        } else {
            return false;
        }
    }

    void setInitialSequence(int val) {
        //TODO
    }

    void setHolder() {
        //TODO
    }
}
