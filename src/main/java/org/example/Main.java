package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;
import org.example.entity.TaskData;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("test1","dummy desc","ann", Status.IN_PROGRESS, Priority.HIGH);
        Task taskAnn2 = new Task("test1","dummy desc2","ann", Status.IN_PROGRESS, Priority.MED);

        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);


        Set<Task> bobsTasks = new HashSet<>();
        Task taskBob = new Task("test2","dummy desc3","bob", Status.ASSIGNED, Priority.HIGH);
        Task taskBob2 = new Task("test2","dummy desc4","bob", Status.IN_QUEUE, Priority.MED);

        bobsTasks.add(taskBob);
        bobsTasks.add(taskBob2);


        Set<Task> carolsTasks = new HashSet<>();
        Task taskCarol = new Task("test2","dummy desc5","carol", Status.ASSIGNED, Priority.HIGH);
        Task taskCarol2 = new Task("test2","dummy desc6","carol", Status.IN_QUEUE, Priority.MED);

        carolsTasks.add(taskCarol);
        carolsTasks.add(taskCarol2);


        Set<Task> unassignedTasks = new HashSet<>();
        Task unassignedTask = new Task("test3","dummy desc4",null, Status.ASSIGNED, Priority.LOW);
        unassignedTasks.add(unassignedTask);

        TaskData taskData = new TaskData(annsTasks,bobsTasks,carolsTasks,unassignedTasks );
        System.out.println(taskData.getTasks("bob"));
        System.out.println(taskData.getTasks("carol"));
        System.out.println(taskData.getTasks("unassignedTask"));


    }
}