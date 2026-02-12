# Factory Method Pattern (FactoryMethod)

## Intent
객체 생성 책임을 서브클래스에 위임하여, 생성 코드와 사용 코드를 분리한다.

## Problem
`PizzaTestDrive`(클라이언트)가 `new NYStyleCheesePizza()` 같은 구체 클래스에 직접 의존하면,
- 지역/스타일이 늘어날수록 `if/switch`가 커지고
- 기존 코드 수정이 반복되며(OCP 위반)
- 테스트/확장 비용이 증가한다.

## Solution in this package
이 패키지는 **Creator** 역할을 하는 `PizzaStore`가 `createPizza()`라는 Factory Method를 제공하고,
지역별 매장인 `NYPizzaStore`, `ChicagoPizzaStore`가 **ConcreteCreator**로서
구체 제품(`NYStyleCheesePizza`, `ChicagoStyleCheesePizza`)을 생성한다.

## Participants (by class)
- Creator: `PizzaStore`
- ConcreteCreator: `NYPizzaStore`, `ChicagoPizzaStore`
- Product: `Pizza`
- ConcreteProduct: `NYStyleCheesePizza`, `ChicagoStyleCheesePizza`
- Client: `PizzaTestDrive`

## Key Idea
- `PizzaStore`는 “피자를 만든다”는 흐름은 알고 있지만, “어떤 피자 클래스”인지는 모른다.
- 생성 결정은 서브클래스(`NYPizzaStore`, `ChicagoPizzaStore`)가 한다.

## How to run
- 실행 클래스: `PizzaTestDrive`

## When to use
- 생성되는 객체 타입이 늘어날 가능성이 높고
- 생성 로직을 한 곳에서 통제하면서도
- 구체 타입 의존을 줄이고 싶을 때

## Trade-offs
- 클래스 수 증가(매장/제품군이 늘면 Creator/ConcreteCreator가 늘어남)
- 생성 로직 분산(각 Store에 생성이 흩어짐)
