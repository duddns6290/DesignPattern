# Proxy Pattern - Protection Proxy (protectionProxy)

## Intent
대리 객체를 통해 접근을 제어한다.
(권한/정책에 따른 메서드 호출 제한)

## Problem
`PersonBean`의 일부 메서드는
- 본인(Owner)만 수정 가능
- 타인(Non-owner)은 일부만 가능
같은 정책이 필요하다.

이 정책을 `PersonBeanImpl` 내부에 직접 넣으면
- 도메인 객체가 정책/보안 로직에 오염되고
- 역할에 따라 분기 코드가 늘어난다.

## Solution in this package
Java Dynamic Proxy(InvocationHandler)를 활용해
역할별 프록시를 생성하고, 호출을 가로채어 정책을 적용한다.
- `OwnerInvocationHandler`
- `NonOwnerInvocationHandler`

## Participants (by class)
- Subject: `PersonBean`
- RealSubject: `PersonBeanImpl`
- Proxy Handler:
  - `OwnerInvocationHandler`
  - `NonOwnerInvocationHandler`
- Client/Run: `MatchMakingTestDrive`

## How to run
- 실행 클래스: `MatchMakingTestDrive`

## When to use
- 객체 접근에 권한/정책/로깅/검증이 필요하고
- 도메인 객체는 순수하게 유지하고 싶을 때
