package com.urdomain.ch13;

import java.util.Arrays;


public class WildCardExample{
	public static void registerCourse( Course<?> course) {
		System.out.println(course.getName() + "������:" + 
				Arrays.toString(course.getStudent()));
	}
	
	public static void registerCourseStudnet( Course<? extends Student>course) {
		System.out.println(course.getName() + "������:" +
				Arrays.toString(course.getStudent()));
	}
	
	public static void registerCourseWorker( Course<? super Worker>course) {
		System.out.println(course.getName() + "������:" +
				Arrays.toString(course.getStudent()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HoghStudent("����л�"));
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
			workerCourse.add(new Worker("������"));
		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
			studentCourse.add(new Student("�л�"));
			studentCourse.add(new HighStudent("����л�"));
		course<HighStudent> highStudentCourse = 
				new Course<HighStudent>("����л�����", 5);
				highStudentCourse.add(new HighStudent("����л�"));
			
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		
	}
	
	
}
