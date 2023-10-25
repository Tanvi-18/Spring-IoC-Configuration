# Spring-IoC-Configuration

## Overview
This repository contains code samples and examples for configuring Spring beans and performing dependency injection using various methods including setters, constructors, and variables. It demonstrates the use of both `BeanFactory` and `ApplicationContext`.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Examples](#examples)
  - [Setter Injection](#setter-injection)
  - [Constructor Injection](#constructor-injection)
  - [Variable Injection](#variable-injection)
- [Important Spring Packages](#important-spring-packages)


## Introduction

Configuring Spring beans and performing dependency injection are fundamental aspects of the Spring Framework. This repository provides examples of how to configure beans and inject dependencies using various techniques, including setter methods, constructors, and variables. It showcases the usage of both `BeanFactory` and `ApplicationContext` for IoC.


## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 11 or higher.
- Apache Maven (for building and managing dependencies).
  

## Examples

This repository includes examples of configuring Spring beans and performing dependency injection using different methods and containers. Each example is located in its respective package under the `com.jsp` namespace.

### Setter Injection

#### BeanFactory Setter Injection

The "BeanFactory Setter Injection" example demonstrates dependency injection using setter methods with the `BeanFactory`. In this example, you'll see how to configure Spring beans and inject dependencies by defining setter methods within your beans.

To explore this example, navigate to the `com.jsp.employee.setterinjection` package in the source code.

#### ApplicationContext Setter Injection

The "ApplicationContext Setter Injection" example illustrates setter-based dependency injection using the `ApplicationContext`. It shows how to configure beans and inject dependencies by defining setter methods in your Spring configuration.

To explore this example, navigate to the `com.jsp.employee.setterinjection` package in the source code.

### Constructor Injection

#### BeanFactory Constructor Injection

The "BeanFactory Constructor Injection" example demonstrates dependency injection through constructors with the `BeanFactory`. You'll learn how to configure Spring beans and inject dependencies by defining constructors with appropriate parameters.

To explore this example, visit the `com.jsp.employee.constructorinjection` package in the source code.

#### ApplicationContext Constructor Injection

The "ApplicationContext Constructor Injection" example shows constructor-based dependency injection using the `ApplicationContext`. It explains how to configure beans and inject dependencies by defining constructors with suitable arguments in your Spring configuration.

To explore this example, navigate to the `com.jsp.employee.constructorinjection` package in the source code.

### Variable Injection

#### BeanFactory Variable Injection

The "BeanFactory Variable Injection" example covers dependency injection using variables with the `BeanFactory`. You'll see how to configure Spring beans and inject dependencies through variables defined in your beans.

To explore this example, go to the `com.jsp.variableinjection` package in the source code.

#### ApplicationContext Variable Injection

The "ApplicationContext Variable Injection" example illustrates variable-based dependency injection using the `ApplicationContext`. It explains how to configure beans and inject dependencies by defining variables in your Spring configuration.

To explore this example, visit the `com.jsp.variableinjection` package in the source code.



## Important Spring Packages

The Spring Framework is a comprehensive and versatile framework for building enterprise applications. Two of the most crucial packages within the Spring Framework are `org.springframework.beans` and `org.springframework.context`.

### org.springframework.beans

The `org.springframework.beans` package is essential for managing JavaBeans and their properties. It provides a range of classes and interfaces that play a fundamental role in the Spring Framework:

- **BeanFactory**: The `BeanFactory` interface is at the core of Spring's IoC container. It defines the methods to access and manage beans, including instantiation, property access, and type conversion. The `BeanFactory` is responsible for creating and configuring beans.

- **BeanDefinition**: The `BeanDefinition` interface defines the configuration metadata for a bean, including its class, scope, and lifecycle details. It's the blueprint for creating beans. 

This package is central to the Spring IoC (Inversion of Control) container, allowing developers to define, configure, and manage beans in a flexible and modular manner.

### org.springframework.context

The `org.springframework.context` package provides the necessary infrastructure for accessing application objects and applying enterprise services. It includes a variety of interfaces and classes that are crucial for building Spring-based applications:

- **ApplicationContext**: The `ApplicationContext` interface is a central component of the Spring Framework. It extends the `BeanFactory` interface and provides a higher-level abstraction. An `ApplicationContext` is capable of managing the lifecycle of beans, supporting internationalization, and providing message sources. It's responsible for creating, initializing, and wiring beans together.

- **MessageSource**: The `MessageSource` interface is used for resolving messages, supporting internationalization and localization. It's particularly valuable for applications with multilingual support.

- **Lifecycle**: The `Lifecycle` interface defines methods for starting and stopping beans. It's essential for beans that require lifecycle management.

Understanding these packages is essential for effectively working with the Spring Framework, implementing Inversion of Control (IoC), and building robust enterprise applications. They provide the foundation for creating and managing beans, accessing application objects, and applying various enterprise services.

