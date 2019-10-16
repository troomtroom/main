package seedu.ichifund.logic.commands.loancommands;

import seedu.ichifund.logic.commands.Command;
import seedu.ichifund.logic.commands.AddCommand;
import seedu.ichifund.logic.commands.CommandResult;
import seedu.ichifund.logic.commands.exceptions.CommandException;
import seedu.ichifund.model.Model;
import seedu.ichifund.model.person.Person;

import static java.util.Objects.requireNonNull;
import static seedu.ichifund.logic.parser.CliSyntax.*;
import static seedu.ichifund.logic.parser.CliSyntax.PREFIX_TAG;

public class LoanSortCommand {
    public static final String COMMAND_WORD = "loansort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a person to the address book. "
            + "Parameters: "
            + PREFIX_NAME + "NAME "
            + PREFIX_PHONE + "PHONE "
            + PREFIX_EMAIL + "EMAIL "
            + PREFIX_ADDRESS + "ADDRESS "
            + "[" + PREFIX_TAG + "TAG]...\n"
            + "Example: " + COMMAND_WORD + " "
            + PREFIX_NAME + "John Doe "
            + PREFIX_PHONE + "98765432 "
            + PREFIX_EMAIL + "johnd@example.com "
            + PREFIX_ADDRESS + "311, Clementi Ave 2, #02-25 "
            + PREFIX_TAG + "friends "
            + PREFIX_TAG + "owesMoney";

    public static final String MESSAGE_SUCCESS = "New person added: %1$s";
    public static final String MESSAGE_DUPLICATE_PERSON = "This person already exists in the address book";

    private final Person toAdd;

    /**
     * Creates an AddCommand to add the specified {@code Person}
     */
    public LoanSortCommand(Person person) {
        requireNonNull(person);
        toAdd = person;
    }

    @Override
    public boolean equals(Object other) {
        return true;
    }
}
