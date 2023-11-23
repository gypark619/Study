-- 1. employees 테이블로부터 사원들의 last_name과 last_name 길이를 출력하되
--    last_name이 'J', 'A', 'M'으로 시작되는 사원만 출력하시오.
--    또한 last_name을 기준으로 오름차순 정렬해서 출력하시오.
SELECT last_name, LENGTH(last_name)
FROM employees
WHERE instr(last_name, 'A') = 1
OR instr(last_name, 'J') = 1
OR instr(last_name, 'M') = 1 
ORDER BY last_name;

-- 2. employees 테이블로부터 사원들의 last_name과 salary를 출력하되
--    특히 급여는 15자리로 표시하고 왼쪽부터 $ 기호가 채워지도록 지정하시오.
SELECT last_name, lpad(salary, 15, '$') 
FROM employees;

-- 3. employees 테이블로부터 사원들의 last_name과 급여 액수를 별표(*)로
--    나타내는 query를 작성하시오. 각 별표는 $1,000를 의미하며 백단위 이하는
--    표시하지 않습니다. 또한 급여의 내림차순으로 데이터를 정렬하여 출력하고
--    컬럼 제목(column alias)을 EMPLOYEES_AND_THEIR_SALARIES로 지정하시오.
SELECT last_name, lpad('',(salary/1000), '*') AS 'EMPLOYEES_AND_THEIR_SALARIES'
FROM employees;

-- 4. employees 테이블로부터 전 사원의 employee_id, last_name, salary를 출력하고
--    마지막 컬럼에는 15.5% 인상된 급여(일의 자리에서 반올림)를 New salary라는
--    제목으로 출력하는 구문을 작성하시오.
SELECT employee_id, last_name, salary, round(salary*1.155) AS 'New salary'
FROM employees;

-- 5. employees 테이블로부터 전 사원의 employee_id, last_name, salary, 
--    15.5% 인상된 급여(New salary), 새 급여에서 이전 급여를 뺀 값(Increase)을
--    출력하는 구문을 작성하시오.
--    (단, 4번째, 5번째 컬럼은 일의 자리에서 반올림하여 정수로 표현하시오)
SELECT employee_id, last_name, salary, round(salary*1.155) AS 'New salary',
		round(salary*1.155 - salary) AS 'Increase'
FROM employees;