import org.junit.jupiter.api.DisplayName;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StackTQSTest {

    private StackTQS<Integer> empty_stack = new StackTQS();
    private StackTQS<Integer> element_stack = new StackTQS();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        element_stack.push(1);
        element_stack.push(2);
        element_stack.push(3);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @DisplayName("A stack is empty on construction")
    @org.junit.jupiter.api.Test
    void isEmpty_On_Creation() {
        assertTrue(empty_stack.isEmpty());
    }

    @DisplayName("On Construction, a stack's size is 0")
    @org.junit.jupiter.api.Test
    void size_On_creation() {
        StackTQS<Integer> stack = new StackTQS();
        assertEquals(0, stack.size());
    }

    @DisplayName("Pop operation on empty stack throws excetion")
    @org.junit.jupiter.api.Test
    void pop_empty() {
        assertThrows( NoSuchElementException.class, ()->empty_stack.pop());
    }

    @DisplayName("Pop operation returns the element on top and reduce size by one")
    @org.junit.jupiter.api.Test
    void pop_not_empty(){
        assertEquals(3, element_stack.pop());
        assertEquals(2, element_stack.pop());
        assertEquals(1, element_stack.pop());
    }

    @DisplayName("Performing n pushes to an empty results on size=n")
    @org.junit.jupiter.api.Test
    void npops_stackOfSizeN(){
        element_stack.pop();
        element_stack.pop();
        element_stack.pop();
        assertTrue(element_stack.isEmpty());
        assertEquals(0, empty_stack.size());
    }

    @DisplayName("Performing n pushes to an empty results on size=n")
    @org.junit.jupiter.api.Test
    void npushes_emptyStack(){
        empty_stack.push(5);
        empty_stack.push(5);
        empty_stack.push(5);
        assertEquals(3, empty_stack.size());
    }

    @DisplayName("Push(n) followed by pop() returns n")
    @org.junit.jupiter.api.Test
    void push_then_pop(){
        empty_stack.push(5);
        assertEquals(1, empty_stack.size());
        assertEquals(5, empty_stack.pop());
        assertEquals(0, empty_stack.size());
    }

    @DisplayName("Push(n) followed by peek() returns n but size stays the same")
    @org.junit.jupiter.api.Test
    void push_then_peek(){
        element_stack.push(5);
        assertEquals(5, element_stack.peek());
        assertEquals(4, element_stack.size());

    }

    @DisplayName("Peeking empty stack throws exception")
    @org.junit.jupiter.api.Test
    void peek_empty(){
        assertThrows(NoSuchElementException.class, ()-> empty_stack.peek());
    }

    @DisplayName("Peeking returns the top element of stack")
    @org.junit.jupiter.api.Test
    void peek_not_empty(){
        assertEquals(3, element_stack.peek());
    }

}
