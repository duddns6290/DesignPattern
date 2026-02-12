# Proxy Pattern - Virtual Proxy (virtualProxy)

## Intent
비용이 큰 객체의 생성을 지연(lazy)하고,
필요할 때 실제 객체를 생성/로딩한다.

## Problem
이미지 같은 리소스는 로딩 비용이 크다.
초기 화면에서 모든 이미지를 다 로딩하면 성능/UX가 떨어진다.

## Solution in this package
`ImageProxy`가 실제 이미지 로딩을 대신 받고,
필요한 시점에 실제 로딩을 수행한다.
UI 컴포넌트는 프록시를 실제 객체처럼 사용한다.

## Participants (by class)
- Subject(역할): `ImageComponent` (UI에서 다루는 인터페이스/컴포넌트 역할)
- Proxy: `ImageProxy`
- Run: `ImageProxyTestDrive`

## How to run
- 실행 클래스: `ImageProxyTestDrive`

## When to use
- 생성 비용이 큰 객체(이미지/네트워크/DB 등)를
  “정말 필요할 때만” 만들고 싶을 때
