/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package de.brownie.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import lombok.Generated;

public class LogWindow
extends JFrame {
    private final JTextArea textArea;
    private final JButton launchButton;
    private final JProgressBar progressBar;

    public LogWindow() {
        super("RiseLauncher Console");
        this.setDefaultCloseOperation(3);
        this.setSize(1000, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.textArea = new JTextArea();
        this.textArea.setEditable(false);
        this.textArea.setFont(new Font("Monospaced", 0, 12));
        this.textArea.setBackground(new Color(30, 30, 30));
        this.textArea.setForeground(new Color(200, 200, 200));
        this.textArea.setMargin(new Insets(5, 5, 5, 5));
        JScrollPane scrollPane = new JScrollPane(this.textArea);
        scrollPane.setBorder(null);
        this.add((Component)scrollPane, "Center");
        JPanel controlPanel = new JPanel(new BorderLayout());
        controlPanel.setBackground(new Color(45, 45, 45));
        this.progressBar = new JProgressBar(0, 100);
        this.progressBar.setStringPainted(true);
        this.progressBar.setString("Ready");
        this.progressBar.setBorderPainted(false);
        this.progressBar.setBackground(new Color(45, 45, 45));
        this.progressBar.setForeground(new Color(60, 179, 113));
        controlPanel.add((Component)this.progressBar, "North");
        JPanel buttonPanel = new JPanel(new FlowLayout(1));
        buttonPanel.setBackground(new Color(45, 45, 45));
        this.launchButton = new JButton("Launch Rise");
        this.launchButton.setFont(new Font("Segoe UI", 1, 14));
        this.launchButton.setFocusPainted(false);
        this.launchButton.setPreferredSize(new Dimension(150, 40));
        buttonPanel.add(this.launchButton);
        controlPanel.add((Component)buttonPanel, "Center");
        this.add((Component)controlPanel, "South");
    }

    public void append(String text) {
        SwingUtilities.invokeLater(() -> {
            this.textArea.append(text);
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
        });
    }

    public void setLaunchEnabled(boolean enabled) {
        SwingUtilities.invokeLater(() -> this.launchButton.setEnabled(enabled));
    }

    public void addLaunchListener(ActionListener listener) {
        this.launchButton.addActionListener(listener);
    }

    public void setProgress(int percent) {
        SwingUtilities.invokeLater(() -> this.progressBar.setValue(percent));
    }

    public void setStatus(String text) {
        SwingUtilities.invokeLater(() -> this.progressBar.setString(text));
    }

    @Generated
    public JTextArea getTextArea() {
        return this.textArea;
    }

    @Generated
    public JButton getLaunchButton() {
        return this.launchButton;
    }

    @Generated
    public JProgressBar getProgressBar() {
        return this.progressBar;
    }
}

