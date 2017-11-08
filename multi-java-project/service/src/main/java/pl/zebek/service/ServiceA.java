package pl.zebek.service;

import pl.zebek.repository.RepositoryA;

/**
 * Created by Bogumil Zebek on 2017-11-08.
 */
public class ServiceA {

    public static void main(String[] args) {
         RepositoryA repositoryA = new RepositoryA();

         repositoryA.store("Some text, bla!");
    }
}
