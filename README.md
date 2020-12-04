1. Button in fragment_first.xml
- Find fragment_first.xml in app/src/main/res/layout
- Open "Code" on top right corner, enter the following under the TextView item.
```xml
<Button
        android:id="@+id/buttonTest"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="142dp"
        android:layout_marginTop="264dp"
        android:layout_marginEnd="142dp"
        android:layout_marginBottom="419dp"
        android:text="@string/button_text"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```

2. Add code in FirstFragment.java
- Find FirstFragment.java in  app/src/main/java/csclub/winterhacksworkshop/ui/firstfrag
- in the onCreateView() method add this block of code underneath the line "final TextView textView = root.findViewById(R.id.text_firstfragment);"
```java
        Button testButton = root.findViewById(R.id.buttonTest);

        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstFragmentViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        textView.setText(s);
                    }
                });
            }
        });
```

3. Button in fragment_second.xml
- Find fragment_first.xml in app/src/main/res/layout
- Just like in the previous one, paste this under the TextView.
```xml
<Button
        android:id="@+id/buttonTestKotlin"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="142dp"
        android:layout_marginTop="264dp"
        android:layout_marginEnd="142dp"
        android:layout_marginBottom="419dp"
        android:text="@string/button_text"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```

4. Add code in SecondFragment.kt
- Find SecondFragment.kt in app/src/main/java/csclub/winterhacksworkshop/ui/secondfrag
- in the onCreateView() method add the below block of code underneath the line "val textView = root.findViewById<TextView>(R.id.text_secondfragment)"
- Reminder: Kotlin doesn't need semicolons!
```kotlin
        val testButtonKotlin: Button = root.findViewById(R.id.buttonTestKotlin)

        testButtonKotlin.setOnClickListener {
            secondFragmentViewModel!!.text.observe(viewLifecycleOwner, Observer { s -> textView.text = s })
        }
      
```

5. Add code in FirstFragmentTest
- Find FirstFragmentTest in app/src/androidTest/java/csclub/winterhacksworkshop/ui/firstfrag
- in ButtonTest() method add the following code:
```java
        onView((withId(R.id.buttonTest)))
                .perform(click());

        onView(withId(R.id.text_firstfragment)).check(matches(withText((("Hello World")))));
```