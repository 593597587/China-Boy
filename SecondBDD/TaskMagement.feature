Feature:团队管理的任务 

description

in order to保证开发进度

As a Scrum Master

I want to 查询未完成的任务

scenarios

Scenarios: 有未完成的任务

Given 团队有任务"Task123"

Given 团队有任务"TaskABC"

When 团队完成"Task123"

Then 未完成任务是"TaskABC"
