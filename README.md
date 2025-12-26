# Calculadora (Java) + Testes com JUnit

Projeto simples de **Calculadora** em Java com operações básicas (**soma, subtração, multiplicação e divisão**) e **testes automatizados**.

## Funcionalidades

- `soma(a, b)` → retorna `a + b`
- `subtrai(a, b)` → retorna `a - b`
- `multiplica(a, b)` → retorna `a * b`
- `dividir(a, b)` → retorna `a / b`

### Observações sobre divisão (double)
Como a implementação usa `double`, valem as regras do IEEE 754:
- `10 / 0` → `Infinity`
- `-10 / 0` → `-Infinity`
- `0 / 0` → `NaN`

Esses comportamentos estão cobertos nos testes.

## Estrutura sugerida

Exemplo de organização comum em projetos Java:
