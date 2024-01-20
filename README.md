# Calculadora en Línea - Pruebas de Usuario con Selenium ⚙️

Java | By Micaela Gordillo

Este repositorio contiene pruebas de usuario para la calculadora en línea utilizando Selenium.

## Pruebas de Usuario

- **Precondiciones:**
  - 🔗 Conexión a Internet.
  - 🖥️ Usuario en la página de la calculadora en línea.

### Historia de Usuario 1: División entre cero y número distinto de cero (positivo) 🚫➗

- **Pasos:**
  1. 🌐 Ingresar a la calculadora.
  2. 🔢 Ingresar un número no cero.
  3. ➗ Presionar el botón de división.
  4. 🔢 Ingresar cero.
  5. ⏹️ Presionar igual.

- **Resultado Esperado:** La calculadora muestra 'Not a Number'.

### Historia de Usuario 2: División entre cero y número distinto de cero (negativo) 🚫➗

- **Pasos:**
  1. 🌐 Ingresar a la calculadora.
  2. 🔢 Ingresar un número.
  3. ➖ Presionar el botón de signo negativo.
  4. ➗ Presionar el botón de división.
  5. 🔢 Ingresar cero.
  6. ⏹️ Presionar igual.

- **Resultado Esperado:** La calculadora muestra 'Not a Number'.

### Historia de Usuario 3: División entre cero y cero 🚫➗0️⃣

- **Pasos:**
  1. 🌐 Ingresar a la calculadora.
  2. 🔢 Ingresar cero.
  3. ➗ Presionar el botón de división.
  4. 🔢 Ingresar cero.
  5. ⏹️ Presionar igual.

- **Resultado Esperado:** La calculadora muestra 'Not a Number'.

<p align="center">
  <img width="50%" src="https://github.com/MicaelaGordillo/calculatorSeleniumTests/assets/88464906/9ec73908-8058-45f7-976c-657c382a05d2"/>
</p>
