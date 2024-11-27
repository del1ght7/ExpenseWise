package com.example.expense;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ExpenseDao {
    @Insert
    void insert(Expenses expense);

    @Query("SELECT * FROM expense_table WHERE userId = :userId")
    List<Expenses> getExpensesByUserId(int userId);

    @Query("SELECT * FROM expense_table")
    List<Expenses> getAllExpenses();

    @Query("DELETE FROM expense_table WHERE userId = :userId")
    void deleteExpensesByUserId(int userId);

    @Query("SELECT SUM(amount) FROM expense_table WHERE userId = :userId")
    double getTotalExpensesByUserId(int userId);
}
