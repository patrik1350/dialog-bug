package com.example.application.views.main;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

@PageTitle("Main")
@Route(value = "")
@PreserveOnRefresh
public class MainView extends HorizontalLayout {

    public MainView() {
        Button button = new Button("Open dialog");
        button.addClickListener(e -> {
            Dialog dialog = new Dialog(new Label("Dialog"));
            dialog.open();
            dialog.addDialogCloseActionListener(event -> System.out.println("Closing dialog"));
        });
        add(button);
    }
}
