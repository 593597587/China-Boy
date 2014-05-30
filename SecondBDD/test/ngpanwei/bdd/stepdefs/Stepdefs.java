/** 
 *  Copyright (c) 2014  Ng Pan Wei
 *  
 *  Permission is hereby granted, free of charge, to any person 
 *  obtaining a copy of this software and associated documentation files 
 *  (the "Software"), to deal in the Software without restriction, 
 *  including without limitation the rights to use, copy, modify, merge, 
 *  publish, distribute, sublicense, and/or sell copies of the Software, 
 *  and to permit persons to whom the Software is furnished to do so, 
 *  subject to the following conditions: 
 *  
 *  The above copyright notice and this permission notice shall be 
 *  included in all copies or substantial portions of the Software. 
 *  
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 *  EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF 
 *  MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 *  NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS 
 *  BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN 
 *  ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN 
 *  CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE 
 *  SOFTWARE. 
 */ 
package ngpanwei.bdd.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import backlog.Backlog;
import backlog.Task;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	Backlog backlog = null ;
	@Before
	public void setup() {
		backlog = new Backlog() ;
	}

	@Given("^团队有任务 \"(.*?)\"$")
	public void 团队有任务(String taskName) throws Throwable {
		Task newTask = backlog.add(taskName) ;
		assertNotNull(newTask) ;
	}
	
	@Given("^团队有带优先级的任务任务 \"(.*?)\" 优先级 \"(.*?)\"$")
	public void 团队有带优先级的任务任务_优先级(String taskName, String priority) throws Throwable {
		Task newTask = backlog.addWithPriority(taskName, priority) ;
		assertNotNull(newTask) ;
	}


	@When("^团队完成 \"(.*?)\"$")
	public void 团队完成(String taskName) throws Throwable {
		Task task = backlog.setTaskStatus(taskName,Task.STATUS_DONE) ;
		assertNotNull("task should exist in backlog",task) ;
	}

	@Then("^团队的未完成任务是 \"(.*?)\"$")
	public void 团队的未完成任务是(String taskName) throws Throwable {
		List<Task> tasks = backlog.getUnompleteTask() ;
		if(tasks.size()!=0){
			Task task = tasks.get(0) ;
			assertEquals(task.getName(),taskName) ;
		}
		else
		{
			assertEquals("无",taskName) ;
		}
	}
	
	@Then("^团队的未完成 \"(.*?)\" 优先级 任务是 \"(.*?)\"$")
	public void 团队的未完成_优先级_任务是(String priority, String status) throws Throwable {
		List<Task> tasks = backlog.getUnompleteTaskWithpriority() ;
		if(tasks.size()!=0){
			Task task = tasks.get(0) ;
			assertEquals(task.getPriority(),priority) ;
		}
		else
		{
			assertEquals("高",priority) ;
			assertEquals("无",status) ;
		}
	}

	
}

