-- 1. employees 테이블로부터 employee_id, last_name, job_id, hire_date를 출력하되
--    컬럼 제목을 각각 Emp #, Employee, Job, Hire Date로 지정하여 출력하시오.
SELECT employee_id AS "Emp #", last_name AS Employee, job_id AS Job, hire_date AS "Hire Date"
FROM employees;


-- 2. employees 테이블로부터 사원들이 담당하고 있는 업무 리스트를 출력하시오.
SELECT DISTINCT job_id  
FROM employees;


-- 3. employees 테이블로부터 2000년도에 입사한 모든 사원의 last_name과 hire_date를 출력하시오.
SELECT last_name, hire_date 
FROM employees
WHERE YEAR(hire_date) = 2000;


-- 4. employees 테이블로부터 커미션을 받지 않은 모든 사원의 last_name, salary, commission_pct를
--    출력하되 salary를 기준으로 내림차순으로 정렬하시오.
SELECT last_name, salary, commission_pct 
FROM employees
WHERE commission_pct IS NOT NULL
ORDER BY salary DESC;


-- 5. employees 테이블과 departmens 테이블을 조인하여 모든 사원의 정보와 함께 부서 정보를
--    함께 출력하시오.
SELECT employee_id, last_name, salary, emp.department_id, department_name
FROM employees emp JOIN departments dep
ON emp.department_id = dep.department_id;


-- 6. employees 테이블로부터 모든 사원의 last_name, employee_id, 매니저 이름, manager_id를
--    함께 출력하시오.
SELECT emp.last_name Employee, emp.employee_id AS "Emp#", man.last_name Manager, emp.manager_id "Mgr#"
FROM employees emp JOIN employees man
ON emp.manager_id = man.employee_id;