## 요구사항
### 🚀 1단계 - 예외 처리와 응답
- [x] 시간 관리 API 정상화 
- [x] 예약 관리 API 정상화
- [x] 발생할 수 있는 예외 상황에 대한 처리를 한다.
  - 시간 생성 시 시작 시간에 유효하지 않은 값이 입력되었을 때
  - 예약 생성 시 예약자명, 날짜, 시간에 유효하지 않은 값이 입력 되었을 때
  - 특정 시간에 대한 예약이 존재하는데, 그 시간을 삭제하려 할 때

### 🚀 2단계 - 테마 추가
- [x] 사용자 예약 시 원하는 테마를 선택할 수 있도록 테마 도메인을 추가한다. (모든 테마는 시작 시간과 소요 시간이 동일하다고 가정합니다.)
- [x] 관리자가 테마를 관리할 수 있도록 기능을 추가한다.
- [x] 관리자가 방탈출 예약 시, 테마 정보를 포함할 수 있도록 기능을 변경한다.
- [x] /admin/theme 요청 시 (templates/admin/theme.html)
- [x] /admin/reservation 요청 시 (templates/admin/reservation-new.html)
- [x] DB 업데이트

### 🚀 3단계 - 사용자 기능
- [x] (관리자가 아닌) 사용자가 예약 가능한 시간을 조회하고, 예약할 수 있도록 기능을 추가/변경 합니다.
- [x] 인기 테마 조회 기능을 추가합니다.
- [x] /reservation 요청 시 (templates/reservation.html)
- [x] 중복 예약 생성 예외 처리
- [x] 과거 시점 예약 생성 예외 처리
- [x] / 요청 시 인기 테마 페이지를 응답 (최근 일주일 예약 건수 내림차순 10개 조회)

### 추후 할 것
- [ ] H2 DB - In memory 에서 Embedded 모드로 변경
- [ ] H2 DB - DB 초기화 쿼리 작성 (불필요한 DirtiesContext 제거)
