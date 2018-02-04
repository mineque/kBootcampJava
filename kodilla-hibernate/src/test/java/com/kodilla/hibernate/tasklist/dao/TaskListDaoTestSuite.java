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
    private static final String DESCRIPTION = "cos cos cos";

    @Test
    public void testFindByListName(){
        //GIVEN
        TaskList list = new TaskList("ToDo");
        //WHEN
        taskListDao.save(list);

        //THEN

        int id = list.getId();
        TaskList readList = taskListDao.findOne(id);
        Assert.assertEquals(id, readList.getId());

        taskListDao.delete(id);
    }

}
