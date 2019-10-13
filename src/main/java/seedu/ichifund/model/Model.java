package seedu.ichifund.model;

import java.nio.file.Path;
import java.util.function.Predicate;

import javafx.collections.ObservableList;
import seedu.ichifund.commons.core.GuiSettings;
import seedu.ichifund.model.person.Person;
import seedu.ichifund.model.transaction.Transaction;

/**
 * The API of the Model component.
 */
public interface Model {
    /** {@code Predicate} that always evaluate to true */
    Predicate<Person> PREDICATE_SHOW_ALL_PERSONS = unused -> true;

    /**
     * Replaces user prefs data with the data in {@code userPrefs}.
     */
    void setUserPrefs(ReadOnlyUserPrefs userPrefs);

    /**
     * Returns the user prefs.
     */
    ReadOnlyUserPrefs getUserPrefs();

    /**
     * Returns the user prefs' GUI settings.
     */
    GuiSettings getGuiSettings();

    /**
     * Sets the user prefs' GUI settings.
     */
    void setGuiSettings(GuiSettings guiSettings);

    /**
     * Returns the user prefs' fund book file path.
     */
    Path getFundBookFilePath();

    /**
     * Sets the user prefs' fund book file path.
     */
    void setFundBookFilePath(Path fundBookFilePath);

    /**
     * Replaces fund book data with the data in {@code fundBook}.
     */
    void setFundBook(ReadOnlyFundBook fundBook);

    /** Returns the FundBook */
    ReadOnlyFundBook getFundBook();

    /**
     * Returns true if a person with the same identity as {@code person} exists in the fund book.
     */
    boolean hasPerson(Person person);

    /**
     * Deletes the given person.
     * The person must exist in the fund book.
     */
    void deletePerson(Person target);

    /**
     * Adds the given person.
     * {@code person} must not already exist in the fund book.
     */
    void addPerson(Person person);

    /**
     * Adds the given transaction.
     */
    void addTransaction(Transaction transaction);

    /**
     * Replaces the given person {@code target} with {@code editedPerson}.
     * {@code target} must exist in the fund book.
     * The person identity of {@code editedPerson} must not be the same as another existing person in the fund book.
     */
    void setPerson(Person target, Person editedPerson);

    /** Returns an unmodifiable view of the filtered person list */
    ObservableList<Person> getFilteredPersonList();

    /**
     * Updates the filter of the filtered person list to filter by the given {@code predicate}.
     * @throws NullPointerException if {@code predicate} is null.
     */
    void updateFilteredPersonList(Predicate<Person> predicate);
}
