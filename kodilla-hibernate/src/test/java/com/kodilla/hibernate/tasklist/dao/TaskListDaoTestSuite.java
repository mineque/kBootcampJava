package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "ToDo";

    @Test
    public void testFindByListName(){
        //GIVEN
        TaskList list = new TaskList(LISTNAME);
        //WHEN
        taskListDao.save(list);

        //THEN

        int id = list.getId();
        String name = list.getListName();

        TaskList readList = taskListDao.findByListName(LISTNAME);
        Assert.assertEquals(name, readList.getListName());

        //CLEANUP
        taskListDao.delete(id);
    }

}
