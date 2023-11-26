-- 1. employees 테이블로부터 2월에 입사한 사원들의 
--    employee_id, last_name, job_id, hire_date, department_id를
--    출력하시오.
SELECT employee_id, last_name, job_id, hire_date, department_id
FROM employees
WHERE month(hire_date) = 2;

-- 2. employees 테이블로부터 오늘 날짜를 기준으로 근무한 주수가
--    1300주 미만인 사원들의 last_name, hire_date, 근무한 일수,
--    근무한 주수를 출력하는 구문을 작성하시오.
SELECT last_name, hire_date,
DATEDIFF(NOW(), hire_date) "근무일수", FLOOR(DATEDIFF(NOW(), hire_date)/7) "근무주수"
FROM employees
WHERE FLOOR(DATEDIFF(NOW(), hire_date)/7) < 1300;

-- 3. employees 테이블로부터 전 사원들의 employee_id, last_name,
--    hire_date, 입사한 날짜에 해당되는 분기를 출력하는 구문을 작성하시오.
--    특히 입사한 날짜에 해당되는 분기를 출력해야하는 4번째 컬럼은
--    예를 들어 입사일이 2000-05-05인 경우 2분기라고 출력될 수 있도록 작성하시오.
SELECT employee_id, last_name, hire_date, CONCAT(QUARTER(hire_date), '분기') "입사한 분기" 
FROM employees;

-- 4. employees 테이블로부터 사원들의 last_name과 commission_pct를 출력하되
--    커미션을 받는 사원은 자신의 커미션 비율을 출력하고, 커미션을 받지 않는
--    사원은 "No Commission"을 출력하는 구문을 작성하시오.
SELECT last_name, IFNULL(commission_pct, "No Commission")
FROM employees;

-- 5. employees 테이블로부터 JOB_ID 값을 기반으로 모든 사원의 등급을
--    표시하는 query를 작성하시오.
SELECT job_id,
CASE job_id WHEN 'AD_PRES'	THEN 'A'
			WHEN 'ST_MAN'	THEN 'B'
			WHEN 'IT_PROG'	THEN 'C'
			WHEN 'SA_REP'	THEN 'D'
			WHEN 'ST_CLERK'	THEN 'E'
			ELSE '0'
END AS "grade"
FROM employees;