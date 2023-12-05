-- 1. employees 테이블로부터 전체 사원들의 커미션 평균을 출력하는 구문을
--    작성하시오. 단, 소수점 둘째자리까지 반올림해서 출력하시오.
SELECT round(avg(ifnull(commission_pct, 0)), 2) avg_comm
FROM employees;

-- 2. employees 테이블로부터 업무(job_id)별 최대 급여(Maximum), 
--    최소 급여(Minimum), 급여의 합계(Sum), 평균 급여(Average)를 출력하시오.
SELECT job_id, max(salary), min(salary), sum(salary), avg(salary)  
FROM employees
GROUP BY job_id;

-- 3. employees 테이블로부터 동일 업무(job_id)를 수행하는 직원 수를 출력하는
--    구문을 작성하시오.
SELECT job_id, count(*) 
FROM employees
GROUP BY job_id;

-- 4. employees 테이블로부터 매니저를 알 수 없는 사원은 제외하고 매니저별로
--    그룹화하여 매니저별 최소 급여를 출력하되 최소 급여가 $6000 이상인
--    그룹만 출력하시오. 또한 최소 급여를 기준으로 내림차순으로 정렬하여 출력하시오.
SELECT manager_id, min(salary) 
FROM employees 
WHERE manager_id IS NOT NULL
GROUP BY manager_id
HAVING min(salary) >= 6000
ORDER BY min(salary) DESC;

-- 5. employees 테이블에서 최고 급여와 최저 급여의 차이를 출력하는 구문을 작성하시오.
SELECT max(salary) - min(salary) DIFFERENCE  
FROM employees;

-- 6. employees 테이블로부터 사원의 총 수와 1995년, 1996년, 1997년, 1998년에 채용된
--    사원의 수를 표시하는 구문을 작성하시오.
SELECT
sum(CASE WHEN YEAR(hire_date) BETWEEN 1995 AND 1998 THEN 1 END) TOTAL,
sum(CASE YEAR(hire_date) WHEN 1995 THEN 1 END) "1995",
sum(CASE YEAR(hire_date) WHEN 1996 THEN 1 END) "1996",
sum(CASE YEAR(hire_date) WHEN 1997 THEN 1 END) "1997",
sum(CASE YEAR(hire_date) WHEN 1998 THEN 1 END) "1998"
FROM employees;